import React, { Component } from 'react'
import ReactivePowerService from '../services/ReactivePowerService'

class ViewReactivePowerComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            reactivePower: {}
        }
    }

    componentDidMount(){
        ReactivePowerService.getReactivePowerById(this.state.id).then( res => {
            this.setState({reactivePower: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View ReactivePower Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> multiplier:&emsp; </label>
                            <div> { this.state.reactivePower.multiplier }</div>
                        </div>
                        <div className = "row">
                            <label> unit:&emsp; </label>
                            <div> { this.state.reactivePower.unit }</div>
                        </div>
                        <div className = "row">
                            <label> value:&emsp; </label>
                            <div> { this.state.reactivePower.value }</div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default ViewReactivePowerComponent
