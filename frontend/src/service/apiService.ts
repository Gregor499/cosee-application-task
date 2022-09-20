import axios, {AxiosResponse} from "axios";
import {PictureData} from "./models";

export const uploadPictureData = (data: PictureData) => {
    return axios.post("api/pictureData", data)
        .then((response) => response.data)
}
