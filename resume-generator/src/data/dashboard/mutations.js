const types = {
  updateMessage: 'updateMessage'
}

const mutations = {
  [types.updateMessage] (state, data) {
    state.message = data.message
  }
}

export default mutations
