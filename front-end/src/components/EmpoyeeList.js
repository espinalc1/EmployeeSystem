import React, { Component } from 'react'
import EmployeeServices from '../services/EmployeeServices';
import axios from 'axios';


class EmpoyeeList extends Component {
    constructor(props) {
        super(props)

        this.state = {
             employee: [],
             employeeListURL: "8080"
        }
    }
    
    componentDidMount() {
        axios.get(this.state.employeeListURL).then((res) => {
            this.setState(
                {
                    employee: res.data
                }
            )
        })
        .catch(error => {
            console.log(error);
            
        })
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Employee List</h2>
                <div className = "row">
                    <table>
                        <thead>
                            <tr>
                                <th>
                                    Employee First Name
                                </th>
                                <th>
                                    Employee Last Name
                                </th>
                                <th>
                                    Employee Email Address
                                </th>
                                <th>
                                    Action
                                </th>

                                <tbody>
                                    {
                                        this.state.employee.map(
                                            employee =>
                                            <tr key = {employee.id}>
                                                <td>{employee.firstName}</td>
                                                <td>{employee.lastName}</td>
                                                <td>{employee.email}</td>
                                            </tr>
                                        )
                                    }
                                </tbody>
                                
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
        )
    }
}

export default EmpoyeeList
