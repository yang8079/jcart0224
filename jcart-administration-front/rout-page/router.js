const routes = [
    { path: '/product/search', component: ProductSearchRoutePage },
    { path: '/customer/search', component: CustomerSearchRoutePage },
    // { path: '/product/update/:productId', component: ProductUpdateRoutePage },

     
    { path: '/order/search', component: OrderSearchRoutePage }
    // { path: '/return/search', component: ReturnSearchRoutePage },
    // { path: '/administrator/index', component: AdministratorIndexRoutePage }
];

const router = new VueRouter({
    routes: routes
});