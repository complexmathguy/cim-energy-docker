import React, { Component } from 'react'
import LimitSetService from '../services/LimitSetService';

class CreateLimitSetComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
                percentageLimitsFlag: ''
        }
        this.changepercentageLimitsFlagHandler = this.changepercentageLimitsFlagHandler.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            LimitSetService.getLimitSetById(this.state.id).then( (res) =>{
                let limitSet = res.data;
                this.setState({
                    percentageLimitsFlag: limitSet.percentageLimitsFlag
                });
            });
        }        
    }
    saveOrUpdateLimitSet = (e) => {
        e.preventDefault();
        let limitSet = {
                limitSetId: this.state.id,
                percentageLimitsFlag: this.state.percentageLimitsFlag
            };
        console.log('limitSet => ' + JSON.stringify(limitSet));

        // step 5
        if(this.state.id === '_add'){
            limitSet.limitSetId=''
            LimitSetService.createLimitSet(limitSet).then(res =>{
                this.props.history.push('/limitSets');
            });
        }else{
            LimitSetService.updateLimitSet(limitSet).then( res => {
                this.props.history.push('/limitSets');
            });
        }
    }
    
    changepercentageLimitsFlagHandler= (event) => {
        this.setState({percentageLimitsFlag: event.target.value});
    }

    cancel(){
        this.props.history.push('/limitSets');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add LimitSet</h3>
        }else{
            return <h3 className="text-center">Update LimitSet</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> percentageLimitsFlag: </label>
                                            #formFields( $attribute, 'create')
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateLimitSet}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                   </div>
            </div>
        )
    }
}

export default CreateLimitSetComponent
