import { createAction, props } from "@ngrx/store"
import { Languages } from "../models/Languages.model"

export const addLanguage = createAction(
    '[Languages] Add Language',
    props<{language: Languages}>() //to pass parameters to the action
)

// export const toggleTodoAction = createAction(
//     '[Todos] Toggle Todo',
//     props<{languageId:number}>() //passing id to the action
// )

export const removeLanguage = createAction(
    '[Languages] Remove Language',
    props<{languageId:number}>()
)