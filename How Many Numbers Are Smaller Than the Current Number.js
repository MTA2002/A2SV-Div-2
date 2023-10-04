**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    const arr=[];
    for(let num1 of nums){
        let count=0;
        for(let num2 of nums){
            if(num2<num1){
                count++;
            }
        }
        
        arr.push(count);
    }
    return arr;
};
