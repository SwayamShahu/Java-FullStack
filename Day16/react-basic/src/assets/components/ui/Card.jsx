const Card = ({users,heading}) => {
  return(<>{
    users.map((user,index) => (
      <div key={index} className="cardbox">
        <h1>{heading}</h1>
        <h4>Name: {user.detail.name}</h4>
        <h4>Age: {user.detail.age}</h4>
        <h4>id: {user.detail.id}</h4>
        <h4>City: {user.address.city}</h4>
        <h4>Zip code: {user.address.zipcode}</h4>
        <h4>Address: {user.address.state}</h4>
        <h4>State: {user.address.country}</h4>
        <h4>Contact: {user.contact.email}</h4>
        <h4>Contact: {user.contact.phone}</h4>
      </div>
    ))
  }

  </>)
};

export default Card;
