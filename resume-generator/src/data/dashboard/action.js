import { fetch } from '@/util/index.js'
const types = {
  updateMessage: 'updateMessage'
}

const actions = {
  test ({ commit }) {
    fetch({ url: '/hello' }).then(response => {
      commit(types.updateMessage, response.data)
    })
  }
}

export default actions
