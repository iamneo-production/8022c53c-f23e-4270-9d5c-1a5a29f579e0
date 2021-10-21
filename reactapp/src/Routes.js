import React from "react"
import {BrowserRouter,Switch,Route} from "react-router-dom";

import Home from "./core/Home"
import Signin from "./user/Signin";
import admin from "./user/admin"
import petreport from "./user/petreport";
const Routes=()=>{
    return(
        <BrowserRouter>
        <Switch>
            <Route path="/" exact component={Home}/>
            <Route path="/Signin" exact component={Signin}/>
            <Route path="/admin" exact component={admin}/>
            <Route path="/petreport" exact component={petreport}/>
        </Switch>

        </BrowserRouter>

    );
};

export default Routes;