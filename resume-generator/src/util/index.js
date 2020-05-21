import axios from 'axios'

export const isEmptyString = (str) => {
  return str === null || str === undefined || str.trim() === ''
}

export const isEmptyObject = (object) => {
  return object === null || object === undefined || Object.keys(object).length === 0
}

export const fetch = ({ method = 'get', url, requestBody }) => {
  if (isEmptyString(url)) {
    throw new ReferenceError('Unvalid value of url!')
  }
  var response = null
  switch (method) {
    case 'get':
      response = axios.get(url)
      break
    case 'post':
      response = axios.post(url, requestBody)
      break
  }
  return response
}
