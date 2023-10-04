/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s=s.replace(/[^a-zA-Z0-9]/g,'');
    s=s.toLowerCase();
    let reversedString="";
    for(let i=s.length-1;i>=0;i--){
        reversedString+=s.charAt(i);
    }
    return reversedString==s;
};
