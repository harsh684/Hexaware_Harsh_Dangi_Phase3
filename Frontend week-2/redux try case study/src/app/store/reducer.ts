import { createReducer, on } from "@ngrx/store";
import { Languages } from "../models/Languages.model";
import { addLanguage, removeLanguage } from "./actions";

export interface LanguageState {

    allLanguages: Languages[];

}

export const initialState: LanguageState = {

    allLanguages: [
        {
            languageId: 1,
            languageName: 'Hindi'
        }


    ]
}

export const LanguagesReducer = createReducer(

        initialState,
        on(addLanguage,(state,{language})=>({

          ...state,
            allLanguages:[...state.allLanguages,language],
            
        })),
        on(removeLanguage,(state,{languageId})=>({

            ...state,
            allLanguages:state.allLanguages.filter( (l) => { return l.languageId !== languageId})
            
          }))
        //   ,
        //   on(toggleTodoAction,(state,{id})=>({
        //     ...state,
        //     todos: state.todos.map( (todo) => (todo.id === id ? {...todo,completed:!todo.completed}: todo )),
        //   }))
);