import {BrowserRouter, Route, Routes} from "react-router-dom";
import StartPage from "./startpage/StartPage";

export default function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path={"/"} element={<StartPage/>}/>
            </Routes>
        </BrowserRouter>

    );
}