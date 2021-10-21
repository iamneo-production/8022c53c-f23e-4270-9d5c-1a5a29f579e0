import React ,{Fragment} from "react";
import {Link,withRouter} from "react-router-dom";

const currentTab=(history,path)=>{
    if(history.location.pathname===path){
        return{color:"#2ecc72"};
    }
    else{
        return{color:"#FFFFFF"};
    }
};

const admin=({history,path})=>{


return(<div>


                            <ul className="nav nav-tabs bg-dark">
                                <li className="nav-item">
                                    <Link style={currentTab(history,"/")} className="nav-link" to="/">Home</Link>
                                    </li>
                                    <Fragment>
                        <li className="nav-item">
                        <Link style={currentTab(history,"/signin")} className="nav-link" to="/signin">logout</Link>
                    
                    </li>
                        </Fragment>
                        </ul>


                    <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
                </nav>
             
 
<div class="container"  >
 <div class="row">
        <div class="col-9">
    
                    <table class="table table-striped ">
                    <thead>
                        <tr>
                        <th scope="col">#</th>
                        <th scope="col">First</th>
                        <th scope="col">Last</th>
                        <th scope="col">Handle</th>
                        <th scope="col">new</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        </tr>
                        <tr>
                        <th scope="row">2</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                        </tr>
                        <tr>
                        <th scope="row">3</th>
                        <td colspan="2">Larry the Bird</td>
                        <td>@twitter</td>
                        </tr>
                    </tbody>
                    </table>
        </div>
            
    <div class="col-3">
    <div class="card">
  
  <div class="card-body" style= {{width: "10rem"}} >
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">An item</li>
    <li class="list-group-item">A second item</li>
    <li class="list-group-item">A third item</li>
  </ul>
  <div class="card-body">
    <a href="/s" class="card-link">Card link</a>
    <a href="/s" class="card-link">Another link</a>
  </div>
</div>
</div>
</div>
</div>

</div>

);

}
export default admin;
