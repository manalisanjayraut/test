import React, { ReactNode } from 'react';
import { Card, CardContent, useTheme } from '@mui/material';

interface ChartComponentProps {
    children: ReactNode;
}

const ChartComponent: React.FC<ChartComponentProps> = ({ children }) => {
    const { palette } = useTheme();

    return (
        <Card sx={{ bgcolor: palette.primary.main, width: "100%" }}>
            <CardContent>
                {children}
            </CardContent>
        </Card>
    );
}

export default ChartComponent;
