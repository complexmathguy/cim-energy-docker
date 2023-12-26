import React, { Component } from 'react'
import PFVArType1IEEEPFControllerService from '../services/PFVArType1IEEEPFControllerService';

class CreatePFVArType1IEEEPFControllerComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
                ovex: '',
                tpfc: '',
                vitmin: '',
                vpf: '',
                vpfcbw: '',
                vpfref: '',
                vvtmax: '',
                vvtmin: ''
        }
        this.changeovexHandler = this.changeovexHandler.bind(this);
        this.changetpfcHandler = this.changetpfcHandler.bind(this);
        this.changevitminHandler = this.changevitminHandler.bind(this);
        this.changevpfHandler = this.changevpfHandler.bind(this);
        this.changevpfcbwHandler = this.changevpfcbwHandler.bind(this);
        this.changevpfrefHandler = this.changevpfrefHandler.bind(this);
        this.changevvtmaxHandler = this.changevvtmaxHandler.bind(this);
        this.changevvtminHandler = this.changevvtminHandler.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            PFVArType1IEEEPFControllerService.getPFVArType1IEEEPFControllerById(this.state.id).then( (res) =>{
                let pFVArType1IEEEPFController = res.data;
                this.setState({
                    ovex: pFVArType1IEEEPFController.ovex,
                    tpfc: pFVArType1IEEEPFController.tpfc,
                    vitmin: pFVArType1IEEEPFController.vitmin,
                    vpf: pFVArType1IEEEPFController.vpf,
                    vpfcbw: pFVArType1IEEEPFController.vpfcbw,
                    vpfref: pFVArType1IEEEPFController.vpfref,
                    vvtmax: pFVArType1IEEEPFController.vvtmax,
                    vvtmin: pFVArType1IEEEPFController.vvtmin
                });
            });
        }        
    }
    saveOrUpdatePFVArType1IEEEPFController = (e) => {
        e.preventDefault();
        let pFVArType1IEEEPFController = {
                pFVArType1IEEEPFControllerId: this.state.id,
                ovex: this.state.ovex,
                tpfc: this.state.tpfc,
                vitmin: this.state.vitmin,
                vpf: this.state.vpf,
                vpfcbw: this.state.vpfcbw,
                vpfref: this.state.vpfref,
                vvtmax: this.state.vvtmax,
                vvtmin: this.state.vvtmin
            };
        console.log('pFVArType1IEEEPFController => ' + JSON.stringify(pFVArType1IEEEPFController));

        // step 5
        if(this.state.id === '_add'){
            pFVArType1IEEEPFController.pFVArType1IEEEPFControllerId=''
            PFVArType1IEEEPFControllerService.createPFVArType1IEEEPFController(pFVArType1IEEEPFController).then(res =>{
                this.props.history.push('/pFVArType1IEEEPFControllers');
            });
        }else{
            PFVArType1IEEEPFControllerService.updatePFVArType1IEEEPFController(pFVArType1IEEEPFController).then( res => {
                this.props.history.push('/pFVArType1IEEEPFControllers');
            });
        }
    }
    
    changeovexHandler= (event) => {
        this.setState({ovex: event.target.value});
    }
    changetpfcHandler= (event) => {
        this.setState({tpfc: event.target.value});
    }
    changevitminHandler= (event) => {
        this.setState({vitmin: event.target.value});
    }
    changevpfHandler= (event) => {
        this.setState({vpf: event.target.value});
    }
    changevpfcbwHandler= (event) => {
        this.setState({vpfcbw: event.target.value});
    }
    changevpfrefHandler= (event) => {
        this.setState({vpfref: event.target.value});
    }
    changevvtmaxHandler= (event) => {
        this.setState({vvtmax: event.target.value});
    }
    changevvtminHandler= (event) => {
        this.setState({vvtmin: event.target.value});
    }

    cancel(){
        this.props.history.push('/pFVArType1IEEEPFControllers');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add PFVArType1IEEEPFController</h3>
        }else{
            return <h3 className="text-center">Update PFVArType1IEEEPFController</h3>
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
                                            <label> ovex: </label>
                                            #formFields( $attribute, 'create')
                                            <label> tpfc: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vitmin: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vpf: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vpfcbw: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vpfref: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vvtmax: </label>
                                            #formFields( $attribute, 'create')
                                            <label> vvtmin: </label>
                                            #formFields( $attribute, 'create')
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdatePFVArType1IEEEPFController}>Save</button>
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

export default CreatePFVArType1IEEEPFControllerComponent
