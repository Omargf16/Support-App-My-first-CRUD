import { createRouter, createWebHistory } from 'vue-router'

import LandingPage from '../views/LandingPage.vue'
import ModifyIncident from '../views/ModifyIncident.vue';
import NewIncident from '../views/NewIncident.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'LandingPage',
      component: LandingPage
    },
    {
      path: '/ModifyIncident',
      name: 'ModifyIncident',
      component: ModifyIncident
    },
    {
      path: '/NewIncident',
      name: 'NewIncident',
      component: () => import('../views/NewIncident.vue')
    }
  ]
})

export default router