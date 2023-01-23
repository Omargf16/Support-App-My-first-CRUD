import { createRouter, createWebHistory } from 'vue-router'
import ModifyIncident from '../views/ModifyIncident.vue';
import NewIncident from '../views/NewIncident.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'ModifyIncident',
      component: ModifyIncident
    },
    {
      path: '/',
      name: 'NewIncident',
      component: NewIncident
    }
   
  ]
})

export default router
