import Job from '../models/jobModel.js';
import * as jobOfferingService from "../services/jobOffering-service.js"

import JobType from '../models/jobTypeModel.js';
import ErrorResponse from  '../utils/errorResponse.js';
//const JobType = require('../models/jobTypeModel');
//const ErrorResponse = require('../utils/errorResponse');

//create job
export  const createJob = async (req, res, next) => {
    try {
        ////const params = { ...req.body };
        const job = await jobOfferingService.save(req);
       
        res.status(201).json({
            success: true,
            job
        })
    } catch (error) {
        next(error);
    }
}


//single job
export  const singleJob = async (req, res, next) => {
    try {
       const job = await jobOfferingService.search(req);
     ///  const job = await Job.findById("65690266a2f39fd3cda727f9");
       console.log(job);
        res.status(200).json({
            success: true,
            job
        })
    } catch (error) {
        next(error);
    }
}


//update job by id.
export const updateJob = async (req, res, next) => {
    try {
        const job = await jobOfferingService.update(req.params.job_id, req.body);
        res.status(200).json({
            success: true,
            job
        });
    } catch (error) {
        next(error);
    }
}


//delete job by id.
export const deleteJob = async (req, res, next) => {
    try {
        const job = await  jobOfferingService.remove(req.params.job_id);
        res.status(200).json({
            success: true,
            message: "job deleted."
        })
    } catch (error) {
        next(error);
    }
}


//update job by id.
export const showJobs = async (req, res, next) => {

    //enable search 
    const keyword = req.query.keyword ? {
        title: {
            $regex: req.query.keyword,
            $options: 'i'
        }
    } : {}


    // filter jobs by category ids
    let ids = [];
    const jobTypeCategory = await JobType.find({}, { _id: 1 });
    jobTypeCategory.forEach(cat => {
        ids.push(cat._id);
    })

    let cat = req.query.cat;
    let categ = cat !== '' ? cat : ids;


    //jobs by location
    let locations = [];
    const jobByLocation = await Job.find({}, { location: 1 });
    jobByLocation.forEach(val => {
        locations.push(val.location);
    });
    let setUniqueLocation = [...new Set(locations)];
    let location = req.query.location;
    let locationFilter = location !== '' ? location : setUniqueLocation;


    //enable pagination
    const pageSize = 5;
    const page = Number(req.query.pageNumber) || 1;
    //const count = await Job.find({}).estimatedDocumentCount();
    const count = await Job.find({ ...keyword, jobType: categ, location: locationFilter }).countDocuments();

    try {
        const jobs = await Job.find({ ...keyword, jobType: categ, location: locationFilter }).sort({ createdAt: -1 }).populate('jobType', 'jobTypeName').populate('user', 'firstName').skip(pageSize * (page - 1)).limit(pageSize)
        res.status(200).json({
            success: true,
            jobs,
            page,
            pages: Math.ceil(count / pageSize),
            count,
            setUniqueLocation

        })
    } catch (error) {
        next(error);
    }
}

