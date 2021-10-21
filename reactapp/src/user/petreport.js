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

const petreport=({history,path})=>{


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



     <div class="container"  >
 <div class="row">
        <div class="col-9">
            <div class="row row-cols-1 row-cols-md-3 g-4">
            <div class="col">
        <div class="card "  >
  
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="/" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
<div class="col">

<div class="card " >

  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="/" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>
</div>
<div class="col">
<div class="card " >
  
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="/" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>
</div>
<div class="col">
        <div class="card"  >
  
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="/" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
        </div>


</div>
        <div class="col-3">

        <div class="card" >

  <div class="card-body">
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

)
}
export default petreport;







