import { createRouter, createWebHistory } from 'vue-router'
import NewIncident from '../views/NewIncident.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'NewIncident',
      component: NewIncident
    },
   
  ]
})

export default router
