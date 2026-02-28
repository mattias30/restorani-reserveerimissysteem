<template>
    <div class="container">
        <h1 class="text-center">ID tests</h1>
        <table class="table table-striped">
            <thead>
                <th>ID</th>
                <th>first name</th>
                <th>last name</th>
            </thead>
            <tbody>
                <tr v-for="test in tests" v-bind:key="test.id">
                    <td>{{ test.id }}</td>
                    <td>{{ test.firstName }}</td>
                    <td>{{ test.lastName }}</td>
                </tr>
            </tbody>
        </table>
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

</style>