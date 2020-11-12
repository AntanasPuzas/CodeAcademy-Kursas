getMaxSubSum = () => {
    const arr = [11, -2, 34, 45, 19, 6];
    let result = 0;

    for (i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            result += arr[i];
        }
    }
    return result;
}

getMaxSubSum_V2 = () => {
    const arr = [11, -2, 34, 45, 19, 6];
    let result = 0;

    for (let value of arr) {
        if (value > 0) {
            result += value;
        }
    }
    return result;
}