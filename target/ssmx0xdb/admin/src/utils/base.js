const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmx0xdb/",
            name: "ssmx0xdb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmx0xdb/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "儿童接种系统"
        } 
    }
}
export default base
