<template>
    <div>
        <h1 class="text-center">ID tests</h1>
        <!-- <div class="containerPlan"> -->
            <div class="con">
                <p class="test" v-for="test in tests" v-bind:key="test.id">
                        {{ test.id }}
                    </p>
            </div>
                <!-- </div> -->

    </div>
</template>

<script>
import testService from '@/services/testService';


    export default {
        name: "testComp",
        data(){
            return {
                tests: []
            }
        },
        methods: {
            getTestsMethod(){
                testService.getTests()
                .then((res) => {
                    this.tests = res.data;
                });
            }
        },
        mounted() {
            this.getTestsMethod()
        }

    }

</script>

<style scoped>
.containerPlan {
    height: 1000px;
    width: 2300px;
    background-image: url('../assets/floor_plan.png'); /* internet src: https://www.bacancytechnology.com/qanda/vue/use-background-images-in-vue-cli-3-with-style-tag*/
    background-size: cover; 
    background-repeat: no-repeat;
    border: 1px solid red; 
}

.con {
    display: flex;
    flex-wrap: wrap;
    padding: 100px;
}

.test {
    width: 600px;
}

#pos1 {

}
</style>