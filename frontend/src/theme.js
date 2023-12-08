// import { createTheme } from '@mui/material/styles';
import { deepPurple, grey, lightBlue } from '@mui/material/colors';

// export const theme = createTheme({
//     palette: {
//         primary: {
//             main: blue[500]
//         },
//         secondary: {
//             main: lightBlue[800],
//             midNightBlue: "#003366"
//         }
//     }
// });

export const themeColors = (mode) => ({
    palette: {
        mode,
        ...(mode === 'light'
            ? {
                // palette values for light mode
                primary: {
                    main: deepPurple[500],
                    white: "#fff"
                },
                secondary: {
                    main:"#1e1e1e",
                    midNightBlue: "#003366"
                },
            }
            : {
                // palette values for dark mode
                primary: {
                    main: "#003366",
                    white:"#fff"
                },
                secondary: {
                    main:"#1e1e1e",
                    midNightBlue: "#003366"
                },
                background: {
                    default: "#1e1e1e",
                },
                text: {
                    main:"#1e1e1e",
                    secondary:"#1e1e1e",
                },
            }),
    },
});
