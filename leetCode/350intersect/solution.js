/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    if(nums1.length> nums2.length){
        return intersect(nums2,nums1);
    }
    var cache = new Map();
    for(var i= 0;i<nums1.length;i++){
        var val = cache.get(nums1[i]);
        if(val){
            cache.set(nums1[i],1 + val)
        }else{
            cache.set(nums1[i],1)
        }
    }
    var ans=[];
    for(var j=0;j<nums2.length;j++){
        var val = cache.get(nums2[j]);
        if(val && val>0){
            ans.push(nums2[j]);
            cache.set(nums2[j], val-1)
        }
    }
    return ans;
};

var nums1 = [4,9,5], nums2 = [9,4,8,4,9];
console.log(intersect(nums1,nums2));