import React from 'react'

const Card = (props) => {
  return (
    <div>
        <h3>Student record</h3>
        <img src={props.img}/>
        <h3>Student Name:{props.name}</h3>
        <h3>Student Class:{props.class}</h3>
    </div>
  )
}

export default Card