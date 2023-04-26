import Vue from 'vue'
import VueRouter from 'vue-router'
import store from "@/store/store";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        component: () => import('../views/Manage.vue'),
        redirect: "/home",
        children: [
            //  首页
            {path: 'home', name: '首页', component: () => import('../views/Home.vue')},
            //  用户管理
            {path: 'user', name: '用户管理', component: () => import('../views/User.vue')},
            //  用户信息界面
            {path: 'person', name: '个人信息', component: () => import('../views/Person.vue')},
            // 文件管理界面
            {path: 'file', name: '文件管理', component: () => import('../views/File.vue')}
        ]
    },
    //  关于页面
    {
        path: '/about',
        name: 'About',
        component: () => import('../views/About.vue')
    },
    {
        path: '/login',
        name: 'Login',
        component: () => import('../views/Login.vue')
    },
    {
        path: '/register',
        name: 'Register',
        component: () => import('../views/Register.vue')
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

// 路由守卫
router.beforeEach((to, from, next) => {
    localStorage.setItem("currentPathName", to.name)  // 设置当前的路由名称，为了在Header组件中去使用
    store.commit("setPath")  // 触发store的数据更新
    next()  // 放行路由
})

export default router
