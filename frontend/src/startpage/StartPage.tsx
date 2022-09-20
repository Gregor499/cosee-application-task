import {useState} from "react";
import "./StartPage.css"
import {uploadPictureData} from "../service/apiService";
import {PictureData} from "../service/models";

export default function StartPage() {
    const [file, setFile] = useState({} as File)
    const [imgUrl, setImgUrl] = useState("/Users/gregordirks/Downloads/Katze.jpg")
    const [tag1, setTag1] = useState("test1")
    const [tag2, setTag2] = useState("test2")
    const [tag3, setTag3] = useState("test3")


    const saveAnswers = () => {
        const pictureData = {file, tag1, tag2, tag3}
        uploadPictureData(pictureData)
    }

    return (
        <div className="body">
            <div className="content">
                <h3 className="pictureGallery">Picture Gallery</h3>
                <form onSubmit={saveAnswers}>
                    <input type="file" id="fileInput" name="fileInput" accept=".jpg"
                           ngf-max-size="2MB" onChange={event => {
                        if (event.target.files !== null) {
                            setFile(event.target.files[0])
                        }
                    }}/>

                    <input type="textbox" name="tag" onChange={event => setTag1(event.target.value)}/>
                    <input type="textbox" name="tag" onChange={event => setTag2(event.target.value)}/>
                    <input type="textbox" name="tag" onChange={event => setTag3(event.target.value)}/>
                    <input type="submit" name="tag" onChange={saveAnswers}/>
                </form>

                <br/>
                <img src={imgUrl}/>
                {tag1}, {tag2}, {tag3}
            </div>
        </div>
    )
}