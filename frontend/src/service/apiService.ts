import axios from "axios";
import {PictureData} from "./models";

export const uploadPictureData = (data: PictureData) => {
    return axios.post("api/galleryItem", data)
}
