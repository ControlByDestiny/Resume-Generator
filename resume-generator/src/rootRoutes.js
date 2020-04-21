import App from '@/views/App/index.vue'
import { routes as Dashboard } from '@/views/Dashboard'

const rootRoutes = [
  {
    path: '',
    component: App,
    children: [
      Dashboard
    ]
  }
]

export default rootRoutes
