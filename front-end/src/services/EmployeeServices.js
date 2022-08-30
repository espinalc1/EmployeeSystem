import axios from 'axios';
import React, { Component } from 'react'



class EmployeeServices extends Component {
    constructor(props) {
        super(props)
        

        this.state = {
             Employe_List_URL: "8080"
        }
    }

    getEmployees() {
        return axios.get(this.state.Employe_List_URL)
    }
    
    
    render() {
        return (
            <div>
                
            </div>
        )
    }
}

export default EmployeeServices


