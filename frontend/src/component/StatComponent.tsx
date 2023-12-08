import React from 'react';
import { Card, CardContent, IconButton, Typography, useTheme } from '@mui/material';

interface StatComponentProps {
  value: string;
  icon: React.ReactNode;
  description: string;
  money?: string;
}

const StatComponent: React.FC<StatComponentProps> = ({ value, icon, description, money }) => {
  const { palette } = useTheme();

  return (
    <Card sx={{ bgcolor: palette.secondary.midNightBlue, width: "100%" }}>
      <CardContent>
        <IconButton sx={{ bgcolor: palette.primary.main, mb: 2 }}>
          {icon}
        </IconButton>
        <Typography variant='h4' sx={{ color: "#fafafa", mb: '1px', fontWeight: 700 }}>
          {money !== '' ? money + value : value}
        </Typography>
        <Typography variant="body2" sx={{ color: palette.primary.main, mb: 0 }}>
          {description}
        </Typography>
      </CardContent>
    </Card>
  );
};

export default StatComponent;