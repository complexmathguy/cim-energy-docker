import React, { Component } from 'react'
import RotatingMachineDynamicsService from '../services/RotatingMachineDynamicsService'

class ViewRotatingMachineDynamicsComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            rotatingMachineDynamics: {}
        }
    }

    componentDidMount(){
        RotatingMachineDynamicsService.getRotatingMachineDynamicsById(this.state.id).then( res => {
            this.setState({rotatingMachineDynamics: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View RotatingMachineDynamics Details</h3>
                    <div className = "card-body">
                    </div>
                </div>
            </div>
        )
    }
}

export default ViewRotatingMachineDynamicsComponent
