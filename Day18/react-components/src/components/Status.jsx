const Status = ({ isOnline }) => {
    return (
        <>
            {isOnline ? <p>Online</p> : <h1>Offline</h1>
            }
        </>
    )
}
export default Status;