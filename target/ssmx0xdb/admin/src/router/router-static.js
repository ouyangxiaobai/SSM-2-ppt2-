import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yimiaochuku from '@/views/modules/yimiaochuku/list'
    import jiezhongyichang from '@/views/modules/jiezhongyichang/list'
    import yimiaozhishi from '@/views/modules/yimiaozhishi/list'
    import yimiaoruku from '@/views/modules/yimiaoruku/list'
    import jiezhongxiangmu from '@/views/modules/jiezhongxiangmu/list'
    import yihurenyuan from '@/views/modules/yihurenyuan/list'
    import yuyuejiezhong from '@/views/modules/yuyuejiezhong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import yimiaoxinxi from '@/views/modules/yimiaoxinxi/list'
    import config from '@/views/modules/config/list'
    import jiezhongdengji from '@/views/modules/jiezhongdengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/yimiaochuku',
        name: '疫苗出库',
        component: yimiaochuku
      }
          ,{
	path: '/jiezhongyichang',
        name: '接种异常',
        component: jiezhongyichang
      }
          ,{
	path: '/yimiaozhishi',
        name: '疫苗知识',
        component: yimiaozhishi
      }
          ,{
	path: '/yimiaoruku',
        name: '疫苗入库',
        component: yimiaoruku
      }
          ,{
	path: '/jiezhongxiangmu',
        name: '接种项目',
        component: jiezhongxiangmu
      }
          ,{
	path: '/yihurenyuan',
        name: '医护人员',
        component: yihurenyuan
      }
          ,{
	path: '/yuyuejiezhong',
        name: '预约接种',
        component: yuyuejiezhong
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/yimiaoxinxi',
        name: '疫苗信息',
        component: yimiaoxinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/jiezhongdengji',
        name: '接种登记',
        component: jiezhongdengji
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
