import React from 'react'
import Home from '../core/Home'
import Menu from "../core/Menu";

const Signin=()=>{

    const signinForm=()=>{
        return (
            <div className="row">
                <div className="col-md-6 offset-sm-3 text-left">
                    <h1>signin</h1>
                    <form>
                    
   
                           <div className="form-group">
                            <label className="text-light">Email</label>
                            <input
                            className="form-control"
                            type="text"
                            />
                            
                           </div>
   
                           <div className="form-group">
                            <label className="text-light">password</label>
                            <input
                            className="form-control"
                            type="password"
                            />
                            
                           </div>
                           <button
                           className="btn btn-success btn-block">Submit</button>
                    </form>
                </div>
            </div>
        )
    }
    return(
   <div>
       <Menu/>
git
       {signinForm()}
   </div>

        
    )



};
export default Signin;