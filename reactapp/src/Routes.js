import React from "react"
import {BrowserRouter,Switch,Route} from "react-router-dom";

import Home from "./core/Home"
import Signin from "./user/Signin";


const Routes=()=>{
    return(
        <BrowserRouter>
        <Switch>
            <Route path="/" exact component={Home}/>
            <Route path="/Signin" exact component={Signin}/>
        </Switch>

        </BrowserRouter>

    );
};

export default Routes;