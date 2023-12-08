import React from 'react';
import { Box, CircularProgress, Theme } from '@mui/material';
import { SxProps } from '@mui/system/styleFunctionSx/styleFunctionSx';

interface LoadingBoxProps {
  // Add any additional props or modify as needed
}

const LoadingBox: React.FC<LoadingBoxProps> = () => {
  const sx: SxProps<Theme> = {
    minHeight: '500px',
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
  };

  return (
    <Box sx={sx}>
      <CircularProgress />
    </Box>
  );
};

export default LoadingBox;
