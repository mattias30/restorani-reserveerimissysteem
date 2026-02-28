import axios from 'axios'

const TEST_API_BASE_URL = 'http://localhost:8080/api/tests'

class TestService {
    getTests(){
        return axios.get(TEST_API_BASE_URL);
    }
}

export default new TestService()