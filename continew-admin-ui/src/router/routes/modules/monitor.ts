import { DEFAULT_LAYOUT } from '../base';
import { AppRouteRecordRaw } from '../types';

const Monitor: AppRouteRecordRaw = {
  path: '/monitor',
  name: 'monitor',
  component: DEFAULT_LAYOUT,
  meta: {
    locale: 'menu.monitor',
    requiresAuth: true,
    icon: 'icon-computer',
    order: 2,
  },
  children: [
    {
      path: 'log/operation',
      name: 'OperationLog',
      component: () => import('@/views/monitor/log/operation/index.vue'),
      meta: {
        locale: 'menu.log.operation.list',
        requiresAuth: true,
        roles: ['*'],
      },
    },
  ],
};

export default Monitor;
