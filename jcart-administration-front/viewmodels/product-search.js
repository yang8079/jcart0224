var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1
    },
    mounted(){
        console.log('view mounted');
        this.searchProduct();
    },
    methods:{
        handlePageChange(val){
            console.log('page change');
            this.pageNum=val;
            this.searchProduct();
        },
        searchProduct(){
            axios.get('/produck/search', {
                params: {
                  pageNum: this.pageNum
                }
              })
              .then(function (response) {
                console.log(response);
                app.pageInfo=response.data;
              })
              .catch(function (error) {
                console.log(error);
              });
        }
    }
})