import React, { ReactNode } from 'react';
import { useSelector } from 'react-redux';
import { Navigate } from 'react-router-dom';

interface AdminRouteProps {
    children: ReactNode;
}

const AdminRoute: React.FC<AdminRouteProps> = ({ children }) => {
    const { userInfo } = useSelector((state: { signIn: { userInfo: { role: number } } }) => state.signIn);

    return userInfo && userInfo.role === 1 ? children : <Navigate to="/" />;
};

export default AdminRoute;
