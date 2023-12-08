import React from 'react';
import { Box, styled, Theme } from '@mui/material';
import SearchInputEl from './SearchInputEl.tsx';
import headerImage from '../images/jobprimarybg.jpg';

const Header: React.FC = () => {
    const StyleHeader = styled(Box)(({ theme }: { theme: Theme }) => ({
        display: "flex",
        justifyContent: 'center',
        alignItems: 'center',
        minHeight: 400,
        backgroundImage: `url(${headerImage})`,
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundColor: theme.palette.secondary.main,
    }));

    return (
        <>
            <StyleHeader>
                <SearchInputEl />
            </StyleHeader>
        </>
    );
};

export default Header;
