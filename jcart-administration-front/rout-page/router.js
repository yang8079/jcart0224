const routes = [
    { path: '/administrator/updateprofile', component: AdministratorUpdateProfileRoutePage },
    { path: '/administrator/update/:administratorId', component: AdministratorUpdateRoutePage },
    { path: '/administrator/index', component: AdministratorIndexRoutePage },
    { path: '/administrator/create', component: AdministratorCreateRoutePage },

    { path: '/product/search', component: ProductSearchRoutePage },
    { path: '/product/update/:productId', component: ProductUpdateRoutePage },
    { path: '/product/create', component: ProductCreateRoutePage },

    { path: '/customer/search', component: CustomerSearchRoutePage },
    { path: '/customer/show/:customerId', component: CustomerShowRoutePage },
    { path: '/address/index/:customerId', component: AddressIndexRoutePage },
    { path: '/address/show/:addressId', component: AddressShowRoutePage },

    { path: '/order/search', component: OrderSearchRoutePage },
    { path: '/order/show/:orderId', component: OrderShowRoutePage },

    { path: '/return/search', component: ReturnSearchRoutePage },
    {
        path: '/return/edit/:returnId',
        component: ReturnEditRoutePage,
        children: [
            {
                path: 'show',
                component: ReturnShowRoutePage
            },
            {
                path: 'history',
                component: ReturnHistoryIndexRoutePage
            }
        ]
    }
];

const router = new VueRouter({
    routes: routes
});