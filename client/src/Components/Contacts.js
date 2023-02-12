import React, {Component} from 'react';
import SingleContact from './SingleContact.js';
import AddContact from './AddContact';

export default class Contacts extends Component{
    constructor(props){
        super(props);
        this.state={
            Contacts: [],
        };
    }

    componentDidMount(){
        fetch('http://localhost:8080/api/contacts')
        .then(response => response.json)
        .then(data => this.setState({Contacts : data}))
    }
    render(){
        return(
            <div>
                <div className='row'>
                    <AddContact/>
                </div>
                <div className='row'>
                    { this.state.Contacts.map((item) => 
                    <SingleContact key={item.id} item={item}/>
                    )}
                </div>
               Hello
            </div>
        ) 
    }
}