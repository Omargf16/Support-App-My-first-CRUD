import { createRouter, createWebHistory } from 'vue-router'
import ModifyIncident from '../views/ModifyIncident.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'ModifyIncident',
      component: ModifyIncident
    },
   
  ]
})

export default router
