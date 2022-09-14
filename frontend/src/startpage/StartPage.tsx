import {useState} from "react";
import "./StartPage.css"
import {uploadPictureData} from "../service/apiService";
import {PictureData} from "../service/models";

export default function StartPage() {
    const [picturePath, setPicturePath] = useState("")
    const [tag1, setTag1] = useState("")
    const [tag2, setTag2] = useState("")
    const [tag3, setTag3] = useState("")


    const saveAnswers = () => {
        const data: PictureData = {picturePath, tag1, tag2, tag3}
        uploadPictureData(data)
    }

    return (
        <div className="body">
            <div className="content">
                <h3 className="pictureGallery">Picture Gallery</h3>
                <form>
                    <input type="file" id="fileInput" name="fileInput" accept=".jpg"
                           ngf-max-size="2MB" onChange={event => setPicturePath(event.target.value)}/>

                    <input type="textbox" onChange={event => setTag1(event.target.value)}/>
                    <input type="textbox" onChange={event => setTag2(event.target.value)}/>
                    <input type="textbox" onChange={event => setTag3(event.target.value)}/>
                    <input type="submit" onChange={saveAnswers}/>
                </form>

            </div>
        </div>
    )
}