import {NavLink} from "react-router-dom";
import {useEffect, useState} from "react";
import axios, {AxiosResponse} from "axios";
import "./StartPage.css"

export default function StartPage() {

    return (
        <div className="body">
            <div className="content">
                <h3 className="pictureGallery">Picture Gallery</h3>
            </div>
        </div>
    );
}