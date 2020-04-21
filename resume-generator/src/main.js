import Vue from 'vue'
import Router from 'vue-router'
import Vuex from 'vuex'
import VueI18n from 'vue-i18n'

import App from '@/views/App/index.vue'
import routes from './rootRoutes'
import data from './data'

Vue.config.productionTip = false

Vue.use(VueI18n)

const i18n = new VueI18n({
  locale: localStorage.getItem('locale') ?? process.env.VUE_APP_DEFAULT_LOCALE,
  messages: {
    zh: require('@/language/zh_cn.js'),
    en: require('@/language/en_us.js')
  }
})

Vue.use(Router)

const router = new Router({
  mode: process.env.VUE_APP_DEFAULT_ROUTE_MODE,
  base: process.env.BASE_URL,
  routes
})

router.beforeEach((to, from, next) => {
  const title = i18n.t(to.meta.title ?? 'Undefined title')
  document.title = title
  next()
})

Vue.use(Vuex)

const store = new Vuex.Store(data)

new Vue({
  router,
  store,
  i18n,
  render: r => r(App)
}).$mount('#app')
