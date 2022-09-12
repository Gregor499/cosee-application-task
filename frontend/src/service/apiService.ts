import axios, {AxiosResponse} from "axios";
import {Model} from "./models";

export const test = (model: Model) => {
    return axios.post("api/test", model)
}
