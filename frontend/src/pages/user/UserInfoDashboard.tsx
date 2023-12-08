import React from 'react';
import { Box, Card, CardContent, Typography } from '@mui/material';
import { useSelector } from 'react-redux';
import { useTheme } from '@mui/material/styles';

interface User {
    firstName: string;
    lastName: string;
    email: string;
    role: number;
}

interface UserProfileState {
    user: User;
}

const UserInfoDashboard: React.FC = () => {
    const { user } = useSelector((state: { userProfile: UserProfileState }) => state.userProfile);
    const { palette } = useTheme();

    return (
        <Box sx={{ maxWidth: '50%', margin: 'auto', pt: 10 }}>
            <Card sx={{ minWidth: 275, bgcolor: palette.secondary.main }}>
                <CardContent>
                    <Typography sx={{ fontSize: 16 }} color="#fafafa" gutterBottom>
                        Personal Info
                    </Typography>
                    <hr style={{ marginBottom: '30px' }} />
                    <Typography variant="h6" component="div" sx={{ color: '#fafafa' }} >
                        First name: {user && user.firstName}
                    </Typography>
                    <Typography variant="h6" component="div" sx={{ color: '#fafafa' }} >
                        Last name: {user && user.lastName}
                    </Typography>
                    <Typography variant="h6" component="div" sx={{ color: '#fafafa' }} >
                        E-mail:  {user && user.email}
                    </Typography>
                    <Typography sx={{ mb: 1.5, color: 'grey', pt: 2 }} color="text.secondary">
                        Status: {user && user.role === 0 ? 'Regular user' : 'Admin'}
                    </Typography>
                </CardContent>
            </Card>
        </Box>
    );
};

export default UserInfoDashboard;
