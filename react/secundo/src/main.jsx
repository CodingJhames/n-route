

import React from 'react';
import {StrictMode} from 'react';
import { FirstApp } from './FirstApp';
import {createRoot} from 'react-dom/client';
import './styles.css';
import { CounterApp } from './CounterApp';


const rootElement = document.getElementById('root');
const root = createRoot( rootElement );


root.render(

    <StrictMode>
        <CounterApp value={21}  />    
    </StrictMode>

);



















